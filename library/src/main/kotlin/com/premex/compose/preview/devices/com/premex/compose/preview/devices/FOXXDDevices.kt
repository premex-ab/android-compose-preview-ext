package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FOXXD device specifications for Android Compose previews.
 *
 * This extension provides FOXXD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FOXXD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FOXXD: Any
  get() = object {
      /** DeviceSpec(manufacturer=FOXXD, code=A2023, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=A2023, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val A2023 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FOXXD, code=A55, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=A55, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val A55 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=FOXXD, code=A551, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=A551, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val A551 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=FOXXD, code=A56, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=A56, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val A56 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=FOXXD, code=A5Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=A5Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A5PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FOXXD, code=A62, width=480, height=1014, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=A62, width=480,
      height=1014, dpi=200, isGoogleDevice=false).code */
      val A62 = "spec:width=480,height=1014,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=FOXXD, code=A65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=A65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FOXXD, code=A65L, width=540, height=1200, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=A65L, width=540,
      height=1200, dpi=200, isGoogleDevice=false).code */
      val A65L = "spec:width=540,height=1200,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=FOXXD, code=A65Plus, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=A65Plus, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val A65PLUS = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=FOXXD, code=A67L, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=A67L, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A67L = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FOXXD, code=AS65U, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=AS65U, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val AS65U = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FOXXD, code=C10, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=C10, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val C10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=FOXXD, code=FOXXD_C65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=FOXXD_C65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val FOXXD_C65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FOXXD, code=HTH_C67, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=HTH_C67, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val HTH_C67 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FOXXD, code=HTH_S67, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=HTH_S67, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val HTH_S67 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=FOXXD, code=L590A, width=640, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=L590A, width=640,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val L590A = "spec:width=640,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FOXXD, code=N5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=N5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val N5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FOXXD, code=P8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=P8, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val P8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FOXXD, code=T55, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=T55, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val T55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FOXXD, code=T8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=T8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FOXXD, code=T8Plus, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=T8Plus, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T8PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=FOXXD, code=T8Pro, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FOXXD, code=T8Pro, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val T8PRO = "spec:width=800,height=1280,unit=px,dpi=240"

  }
