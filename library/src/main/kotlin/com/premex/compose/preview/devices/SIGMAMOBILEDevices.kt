package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SIGMA_MOBILE device specifications for Android Compose previews.
 *
 * This extension provides SIGMA_MOBILE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SIGMAMOBILE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SIGMAMOBILE: Any
  get() = object {
      /** SIGMA_MOBILE TabA1015 */
      val TABA1015 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** SIGMA_MOBILE TabA1020 */
      val TABA1020 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** SIGMA_MOBILE X_treme_PQ38 */
      val X_TREME_PQ38 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SIGMA_MOBILE X_TREME_PQ39 */
      val X_TREME_PQ39 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
