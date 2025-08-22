package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * malata device specifications for Android Compose previews.
 *
 * This extension provides malata device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Malata.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Malata: Any
  get() = object {
      /** malata UV350 */
      val UV350 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
