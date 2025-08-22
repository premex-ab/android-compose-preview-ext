package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Cloud_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Cloud_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CloudMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CloudMobile: Any
  get() = object {
      /** Cloud_Mobile Stratus_C7 */
      val STRATUS_C7 = "spec:width=480,height=960,unit=px,dpi=213"

      /** Cloud_Mobile Stratus_C8 */
      val STRATUS_C8 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Cloud_Mobile Sunshine_T2_Elite */
      val SUNSHINE_T2_ELITE = "spec:width=800,height=1280,unit=px,dpi=213"

  }
