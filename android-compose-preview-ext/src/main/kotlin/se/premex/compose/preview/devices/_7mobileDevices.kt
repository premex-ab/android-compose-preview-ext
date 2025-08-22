package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * 7mobile device specifications for Android Compose previews.
 *
 * This extension provides 7mobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices._7mobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices._7mobile: Any
  get() = object {
      /** 7mobile Swegue_2 */
      val SWEGUE_2 = "spec:width=480,height=996,unit=px,dpi=240"

      /** 7mobile 7mobile_Kamba_2 */
      val _7MOBILE_KAMBA_2 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
