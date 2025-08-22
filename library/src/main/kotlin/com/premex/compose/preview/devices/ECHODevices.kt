package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ECHO device specifications for Android Compose previews.
 *
 * This extension provides ECHO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ECHO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ECHO: Any
  get() = object {
      /** ECHO ECHO_FUSION */
      val ECHO_FUSION = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ECHO ECHO_LOLLY */
      val ECHO_LOLLY = "spec:width=480,height=800,unit=px,dpi=240"

      /** ECHO FEELING */
      val FEELING = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ECHO HOLI */
      val HOLI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ECHO HORIZON_LITE_PLUS */
      val HORIZON_LITE_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ECHO HORIZON_M */
      val HORIZON_M = "spec:width=640,height=1280,unit=px,dpi=280"

      /** ECHO LOOK */
      val LOOK = "spec:width=640,height=1280,unit=px,dpi=320"

      /** ECHO Stellar_4G */
      val STELLAR_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ECHO SURF */
      val SURF = "spec:width=480,height=960,unit=px,dpi=240"

  }
