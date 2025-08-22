package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZIK device specifications for Android Compose previews.
 *
 * This extension provides ZIK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zik.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zik: Any
  get() = object {
      /** ZIK ZIK_W1027 */
      val ZIK_W1027 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
