package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sharp device specifications for Android Compose previews.
 *
 * This extension provides Sharp device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sharp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sharp: Any
  get() = object {
      /** DeviceSpec(manufacturer=Sharp, code=AG3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=AG3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AG3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sharp, code=bruno, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=bruno, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sharp, code=bumblebee, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=bumblebee, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BUMBLEBEE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sharp, code=Cruze_Lite_S, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=Cruze_Lite_S,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val CRUZE_LITE_S = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sharp, code=Cruze_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=Cruze_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val CRUZE_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sharp, code=expo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=expo, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val EXPO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sharp, code=kaitak, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=kaitak, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KAITAK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sharp, code=laoshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=laoshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAOSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sharp, code=SE3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=SE3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SE3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sharp, code=SE3_TH, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=SE3_TH, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SE3_TH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sharp, code=SE3_VN, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=SE3_VN, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SE3_VN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sharp, code=shilin, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=shilin, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sharp, code=SH-A01, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=SH-A01, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SH_A01 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sharp, code=SJ3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=SJ3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SJ3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sharp, code=SK3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=SK3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SK3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sharp, code=SW4H_FF, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sharp, code=SW4H_FF, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H_FF = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
