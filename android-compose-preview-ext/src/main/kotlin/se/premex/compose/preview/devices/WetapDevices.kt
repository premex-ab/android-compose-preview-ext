package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * WeTap device specifications for Android Compose previews.
 *
 * This extension provides WeTap device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wetap.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wetap: Any
  get() = object {
      /** WeTap WeTap_Y10 */
      val WETAP_Y10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
