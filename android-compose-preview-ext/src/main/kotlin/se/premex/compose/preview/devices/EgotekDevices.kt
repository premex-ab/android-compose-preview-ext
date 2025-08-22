package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * EGOTEK device specifications for Android Compose previews.
 *
 * This extension provides EGOTEK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Egotek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Egotek: Any
  get() = object {
      /** EGOTEK EGO1003 */
      val EGO1003 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
