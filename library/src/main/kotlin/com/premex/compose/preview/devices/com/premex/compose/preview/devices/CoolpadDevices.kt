package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Coolpad device specifications for Android Compose previews.
 *
 * This extension provides Coolpad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Coolpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Coolpad: Any
  get() = object {
      /** DeviceSpec(manufacturer=Coolpad, code=A8, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=A8, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val A8 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Coolpad, code=A8-831, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=A8-831, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val A8_831 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Coolpad, code=A8-930, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=A8-930, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val A8_930 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Coolpad, code=apollo, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=apollo, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val APOLLO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Coolpad, code=B770, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=B770, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val B770 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Coolpad, code=C103, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=C103, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val C103 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Coolpad, code=C1-S02, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=C1-S02, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val C1_S02 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Coolpad, code=Coolpad5267, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=Coolpad5267,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val COOLPAD5267 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Coolpad, code=Coolpad5370, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=Coolpad5370,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val COOLPAD5370 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=Coolpad7295A, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=Coolpad7295A,
      width=480, height=854, dpi=213, isGoogleDevice=false).code */
      val COOLPAD7295A = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Coolpad, code=Coolpad8737A, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=Coolpad8737A,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val COOLPAD8737A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=CoolpadE2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CoolpadE2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val COOLPADE2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=Coolpad_1803, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=Coolpad_1803,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val COOLPAD_1803 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=Coolpad_2041, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=Coolpad_2041,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val COOLPAD_2041 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=Coolpad_2041_S0, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=Coolpad_2041_S0,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val COOLPAD_2041_S0 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=Coolpad_2041_U0, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=Coolpad_2041_U0,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val COOLPAD_2041_U0 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=cool_c1, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=cool_c1, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val COOL_C1 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Coolpad, code=CP12t, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CP12t, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val CP12T = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=cp3320a, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=cp3320a, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val CP3320A = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Coolpad, code=CP3503I, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CP3503I, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CP3503I = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=CP3503L, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CP3503L, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val CP3503L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=CP3504L, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CP3504L, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val CP3504L = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=CP3505I, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CP3505I, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CP3505I = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=CP3505I_U00, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CP3505I_U00,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CP3505I_U00 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=CP3600I, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CP3600I, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CP3600I = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Coolpad, code=cp3622a, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=cp3622a, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CP3622A = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Coolpad, code=cp3632a, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=cp3632a, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CP3632A = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Coolpad, code=cp3636a, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=cp3636a, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CP3636A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=cp3648a, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=cp3648a, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CP3648A = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=cp3648at, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=cp3648at, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CP3648AT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=CP3667AT, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CP3667AT, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val CP3667AT = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Coolpad, code=CP3669AS, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CP3669AS, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val CP3669AS = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=CP8676_I03, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CP8676_I03,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val CP8676_I03 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Coolpad, code=CP8722_S00, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CP8722_S00,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val CP8722_S00 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Coolpad, code=CP8722_U00, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CP8722_U00,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CP8722_U00 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=CPY83_I00, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CPY83_I00, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CPY83_I00 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=CPY83_S00, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CPY83_S00, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CPY83_S00 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=CPY83_U00, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=CPY83_U00, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CPY83_U00 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=E561_EU, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=E561_EU, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val E561_EU = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=K2L_S00, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=K2L_S00, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val K2L_S00 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=k69v1_64, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=k69v1_64, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val K69V1_64 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=lithium, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=lithium, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val LITHIUM = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Coolpad, code=R108, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=R108, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val R108 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=ventura, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=ventura, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val VENTURA = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Coolpad, code=victor, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=victor, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val VICTOR = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Coolpad, code=Y72_921, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=Y72_921, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Y72_921 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=Y91, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=Y91, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Y91 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=1821, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=1821, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val _1821 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=1826-I01, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=1826-I01, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val _1826_I01 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Coolpad, code=1901, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=1901, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val _1901 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Coolpad, code=8750, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Coolpad, code=8750, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val _8750 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
