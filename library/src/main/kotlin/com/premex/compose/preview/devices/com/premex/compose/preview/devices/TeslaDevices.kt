package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tesla device specifications for Android Compose previews.
 *
 * This extension provides Tesla device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tesla.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tesla: Any
  get() = object {
      /** DeviceSpec(manufacturer=Tesla, code=anaheim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=anaheim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tesla, code=Explr_9, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=Explr_9, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val EXPLR_9 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Tesla, code=guandu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=guandu, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tesla, code=L6195, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=L6195, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val L6195 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Tesla, code=LAS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=LAS, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tesla, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Tesla, code=shinagawa, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=shinagawa, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Tesla, code=SW4H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=SW4H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tesla, code=SW6H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=SW6H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tesla, code=tamachi, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=tamachi, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Tesla, code=Tesla_L8_2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=Tesla_L8_2, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TESLA_L8_2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Tesla, code=Tesla_SP3_3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=Tesla_SP3_3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TESLA_SP3_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tesla, code=Tesla_SP3_3Lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=Tesla_SP3_3Lite,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val TESLA_SP3_3LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tesla, code=Tesla_SP3_4, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=Tesla_SP3_4, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TESLA_SP3_4 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tesla, code=Tesla_SP3_5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=Tesla_SP3_5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TESLA_SP3_5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tesla, code=Tesla_SP6_3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=Tesla_SP6_3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TESLA_SP6_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tesla, code=Tesla_SP6_4_Lite, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=Tesla_SP6_4_Lite,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val TESLA_SP6_4_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tesla, code=Tesla_SP9_2, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=Tesla_SP9_2, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val TESLA_SP9_2 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Tesla, code=umeda, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=umeda, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Tesla, code=yeongdeungpo, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tesla, code=yeongdeungpo,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
