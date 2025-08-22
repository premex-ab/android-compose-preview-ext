package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZTE device specifications for Android Compose previews.
 *
 * This extension provides ZTE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZTE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZTE: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZTE, code=abby, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=abby, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ABBY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=achill, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=achill, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val ACHILL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=ailsa, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ailsa, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val AILSA = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=ZTE, code=ailsa_ii, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ailsa_ii, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val AILSA_II = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=ZTE, code=alice, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=alice, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ALICE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=B860H_V1, width=1080, height=1920, dpi=238,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=B860H_V1, width=1080,
      height=1920, dpi=238, isGoogleDevice=false).code */
      val B860H_V1 = "spec:width=1080,height=1920,unit=px,dpi=238"

      /** DeviceSpec(manufacturer=ZTE, code=baffin, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=baffin, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val BAFFIN = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=beam, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=beam, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BEAM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=benz, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=benz, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BENZ = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=billy, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=billy, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BILLY = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=Blade_L3_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Blade_L3_Plus, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BLADE_L3_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=bolton, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=bolton, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BOLTON = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=breaker, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=breaker, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BREAKER = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=calbee, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=calbee, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CALBEE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=camellia, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=camellia, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CAMELLIA = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=candice, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=candice, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val CANDICE = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=ZTE, code=carol, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=carol, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val CAROL = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=chapel, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=chapel, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CHAPEL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=cinco, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=cinco, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val CINCO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=crocus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=crocus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CROCUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=dandelion, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=dandelion, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val DANDELION = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=draco, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=draco, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val DRACO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=financier, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=financier, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FINANCIER = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=florist, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=florist, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val FLORIST = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=fortune, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=fortune, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FORTUNE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=fujisan, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=fujisan, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val FUJISAN = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=gevjon, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=gevjon, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val GEVJON = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=gift, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=gift, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GIFT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=grayjoy, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=grayjoy, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val GRAYJOY = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=grayjoylite, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=grayjoylite, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val GRAYJOYLITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=guardian, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=guardian, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val GUARDIAN = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=helen, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=helen, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HELEN = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZTE, code=jasmine, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=jasmine, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val JASMINE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZTE, code=jeff, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=jeff, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val JEFF = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=jerry, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=jerry, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val JERRY = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=K83, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=K83, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val K83 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=K83CA, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=K83CA, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val K83CA = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=K85, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=K85, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val K85 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=K87, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=K87, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val K87 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=K95, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=K95, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val K95 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=K96, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=K96, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val K96 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=kelly, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=kelly, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val KELLY = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=lavender, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=lavender, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val LAVENDER = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=lemon, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=lemon, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val LEMON = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=lewis, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=lewis, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LEWIS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=lol, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=lol, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LOL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=martell, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=martell, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MARTELL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=max, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=max, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MAX = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=mimir, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=mimir, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MIMIR = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=MO-01J, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=MO-01J, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MO_01J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=MO-01K, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=MO-01K, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MO_01K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=msm8226, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=msm8226, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MSM8226 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=msm8909, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=msm8909, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MSM8909 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=msm8916_32, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=msm8916_32, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MSM8916_32 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=msm8916_64, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=msm8916_64, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val MSM8916_64 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=msm8937, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=msm8937, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val MSM8937 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=msm8952_64, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=msm8952_64, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val MSM8952_64 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=msm8974, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=msm8974, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MSM8974 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=msm8994, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=msm8994, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val MSM8994 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=msm8996, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=msm8996, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val MSM8996 = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=ZTE, code=NX597J, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=NX597J, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NX597J = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=oldman, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=oldman, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val OLDMAN = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZTE, code=P172A40, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P172A40, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P172A40 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P172E10, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P172E10, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P172E10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P172R10, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P172R10, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val P172R10 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P182A10, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P182A10, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P182A10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P182A20, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P182A20, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P182A20 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P450F10, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P450F10, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val P450F10 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P450L10, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P450L10, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val P450L10 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P545, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P545, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P545 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P606F01, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P606F01, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P606F01 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P606F02, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P606F02, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P606F02 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P606F05, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P606F05, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P606F05 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P606F07, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P606F07, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P606F07 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P606F08, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P606F08, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val P606F08 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P606F09, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P606F09, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P606F09 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P606F10, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P606F10, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P606F10 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P606F13, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P606F13, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P606F13 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P606F17, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P606F17, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P606F17 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P606F19, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P606F19, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val P606F19 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P606F20, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P606F20, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P606F20 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P606F21, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P606F21, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P606F21 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P606T07C, width=800, height=1280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P606T07C, width=800,
      height=1280, dpi=480, isGoogleDevice=false).code */
      val P606T07C = "spec:width=800,height=1280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P609, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P609, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P609 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P615F01, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P615F01, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P615F01 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P616F01, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P616F01, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val P616F01 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P616F02, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P616F02, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P616F02 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P616F03, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P616F03, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P616F03 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P616F05, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P616F05, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P616F05 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P616T01C, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P616T01C, width=1200,
      height=1920, dpi=360, isGoogleDevice=false).code */
      val P616T01C = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=ZTE, code=P616T02C, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P616T02C, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val P616T02C = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P616T02_AC, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P616T02_AC, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val P616T02_AC = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P616T03C, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P616T03C, width=1200,
      height=1920, dpi=360, isGoogleDevice=false).code */
      val P616T03C = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=ZTE, code=P616T03_AC, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P616T03_AC, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val P616T03_AC = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P618A01, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P618A01, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val P618A01 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P618A03, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P618A03, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val P618A03 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P618A11, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P618A11, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P618A11 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P618F05, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P618F05, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P618F05 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P618F06, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P618F06, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P618F06 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P618F07, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P618F07, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P618F07 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P618F08, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P618F08, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P618F08 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P618T01C, width=1200, height=2000, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P618T01C, width=1200,
      height=2000, dpi=340, isGoogleDevice=false).code */
      val P618T01C = "spec:width=1200,height=2000,unit=px,dpi=340"

      /** DeviceSpec(manufacturer=ZTE, code=P632A10, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P632A10, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P632A10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P632T31, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P632T31, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P632T31 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P633F05, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P633F05, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P633F05 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P633F08, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P633F08, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P633F08 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P633F10, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P633F10, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val P633F10 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P633S01, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P633S01, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P633S01 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P633S05, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P633S05, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P633S05 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P633S07, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P633S07, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P633S07 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P633S08, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P633S08, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P633S08 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P633S31, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P633S31, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P633S31 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P635A20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P635A20, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P635A20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P635A31, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P635A31, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P635A31 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P635A50, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P635A50, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P635A50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P635A60, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P635A60, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val P635A60 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P635E40, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P635E40, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val P635E40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P635F33, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P635F33, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P635F33 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P635F50, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P635F50, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P635F50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P635N34, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P635N34, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P635N34 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P635T36, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P635T36, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P635T36 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P635T39, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P635T39, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P635T39 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P635T40, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P635T40, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P635T40 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P637F02, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P637F02, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P637F02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P637F10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P637F10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P637F10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P637S02, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P637S02, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P637S02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P637S15, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P637S15, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P637S15 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P637T02, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P637T02, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P637T02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P637T10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P637T10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P637T10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P639F10, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P639F10, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P639F10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P639F10L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P639F10L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P639F10L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P639S10, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P639S10, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P639S10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P639T10, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P639T10, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P639T10 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P650A30, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P650A30, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P650A30 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P650A31, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P650A31, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P650A31 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P653A10, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P653A10, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P653A10 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P653A11, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P653A11, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P653A11 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P653N11, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P653N11, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P653N11 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P653N31, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P653N31, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P653N31 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P653S06, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P653S06, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P653S06 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P653S07, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P653S07, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P653S07 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P655A30, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P655A30, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P655A30 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P662F02, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P662F02, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P662F02 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P662F02D, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P662F02D, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P662F02D = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P662F02_D1, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P662F02_D1, width=1080,
      height=2220, dpi=440, isGoogleDevice=false).code */
      val P662F02_D1 = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=ZTE, code=P662F02_D2, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P662F02_D2, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P662F02_D2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P671A11, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P671A11, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val P671A11 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P671A13, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P671A13, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val P671A13 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P671F20, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P671F20, width=1080,
      height=2220, dpi=440, isGoogleDevice=false).code */
      val P671F20 = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=ZTE, code=P671F20D, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P671F20D, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val P671F20D = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P671F50, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P671F50, width=1080,
      height=2220, dpi=440, isGoogleDevice=false).code */
      val P671F50 = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=ZTE, code=P671F50_D, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P671F50_D, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P671F50_D = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P671F60, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P671F60, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val P671F60 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P671F70, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P671F70, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P671F70 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P671S02, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P671S02, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P671S02 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P671S20, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P671S20, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val P671S20 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P675T07, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P675T07, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P675T07 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P680A10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P680A10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P680A10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P680A20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P680A20, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P680A20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P683S10, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P683S10, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val P683S10 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P720F02, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P720F02, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P720F02 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P720F03, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P720F03, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val P720F03 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P720F03_A, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P720F03_A, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val P720F03_A = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P720F05, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P720F05, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P720F05 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P720F09, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P720F09, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P720F09 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P720S07, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P720S07, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P720S07 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P720S11, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P720S11, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P720S11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P725A02, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P725A02, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val P725A02 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P725A11, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P725A11, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val P725A11 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P725A12, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P725A12, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val P725A12 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P731A10, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P731A10, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P731A10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P731A20, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P731A20, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val P731A20 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P731F10, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P731F10, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P731F10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P731F12, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P731F12, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P731F12 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P731F20, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P731F20, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P731F20 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P731F21, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P731F21, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P731F21 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P731F30, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P731F30, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val P731F30 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P731F50, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P731F50, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P731F50 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P731F60, width=480, height=1014, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P731F60, width=480,
      height=1014, dpi=240, isGoogleDevice=false).code */
      val P731F60 = "spec:width=480,height=1014,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P731K30, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P731K30, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val P731K30 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P768A02, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P768A02, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P768A02 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P780F03, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P780F03, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P780F03 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P809A01, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P809A01, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val P809A01 = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ZTE, code=P809A20, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P809A20, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P809A20 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P809A50, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P809A50, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P809A50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P809F01, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P809F01, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val P809F01 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P809F10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P809F10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P809F10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P809F12, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P809F12, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P809F12 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P809F15, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P809F15, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P809F15 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P809F20, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P809F20, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P809F20 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P809F30, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P809F30, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P809F30 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P809F40, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P809F40, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P809F40 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P809F52, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P809F52, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P809F52 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P809K50, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P809K50, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P809K50 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P809S10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P809S10, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P809S10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P809T70, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P809T70, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P809T70 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P816A20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P816A20, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P816A20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P817E52, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P817E52, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P817E52 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P817E53, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P817E53, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P817E53 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P817F01, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P817F01, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P817F01 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P817F18, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P817F18, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P817F18 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P817S01, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P817S01, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P817S01 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P817S13, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P817S13, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P817S13 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P839F30, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P839F30, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P839F30 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P839T30, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P839T30, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P839T30 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P839T60, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P839T60, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P839T60 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P840F03, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P840F03, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P840F03 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P840F12, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P840F12, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P840F12 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P840F13, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P840F13, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P840F13 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P840F20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P840F20, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P840F20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P840S03, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P840S03, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P840S03 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P840S18, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P840S18, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P840S18 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P840T22, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P840T22, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P840T22 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P845A01, width=1080, height=2248, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P845A01, width=1080,
      height=2248, dpi=480, isGoogleDevice=false).code */
      val P845A01 = "spec:width=1080,height=2248,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P845A02, width=1080, height=2248, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P845A02, width=1080,
      height=2248, dpi=480, isGoogleDevice=false).code */
      val P845A02 = "spec:width=1080,height=2248,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P852F52, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P852F52, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P852F52 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P855A01, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P855A01, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val P855A01 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P855A03, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P855A03, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val P855A03 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P855A03_NA, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P855A03_NA, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val P855A03_NA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P855A21, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P855A21, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val P855A21 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P870A01, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P870A01, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val P870A01 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P870A02, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P870A02, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val P870A02 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P870A21, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P870A21, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P870A21 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P870F21, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P870F21, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P870F21 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P875A02, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P875A02, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P875A02 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P875A11, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P875A11, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P875A11 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P875A12, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P875A12, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P875A12 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P876T01J, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P876T01J, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val P876T01J = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P898A01, width=1116, height=2480, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P898A01, width=1116,
      height=2480, dpi=480, isGoogleDevice=false).code */
      val P898A01 = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P898A11, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P898A11, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P898A11 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P898A25, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P898A25, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P898A25 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P898F01, width=1116, height=2480, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P898F01, width=1116,
      height=2480, dpi=480, isGoogleDevice=false).code */
      val P898F01 = "spec:width=1116,height=2480,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=P898P01, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P898P01, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val P898P01 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P932F10, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P932F10, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P932F10 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P932F20, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P932F20, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P932F20 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P932F21, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P932F21, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P932F21 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P932F22, width=480, height=1014, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P932F22, width=480,
      height=1014, dpi=240, isGoogleDevice=false).code */
      val P932F22 = "spec:width=480,height=1014,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P932F23, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P932F23, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P932F23 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P932F50, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P932F50, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P932F50 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P932K20, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P932K20, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P932K20 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P963F01, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F01, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val P963F01 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F01D, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F01D, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val P963F01D = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F02, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F02, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P963F02 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F03, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F03, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P963F03 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F05, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F05, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val P963F05 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F06, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F06, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val P963F06 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F07, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F07, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P963F07 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F10, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F10, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P963F10 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P963F30, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F30, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P963F30 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F30P, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F30P, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P963F30P = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F50, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F50, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P963F50 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F50_A, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F50_A, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val P963F50_A = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F51W, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F51W, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val P963F51W = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ZTE, code=P963F60, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F60, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P963F60 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F61, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F61, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P963F61 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F61_A, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F61_A, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P963F61_A = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F62, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F62, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P963F62 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F63, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F63, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P963F63 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F64, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F64, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P963F64 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P963F65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F66, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F66, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val P963F66 = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P963F70, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F70, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P963F70 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F80, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F80, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P963F80 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P963F90W, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F90W, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P963F90W = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F91, width=480, height=1014, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F91, width=480,
      height=1014, dpi=240, isGoogleDevice=false).code */
      val P963F91 = "spec:width=480,height=1014,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P963F92, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F92, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P963F92 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P963F93, width=480, height=1014, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F93, width=480,
      height=1014, dpi=240, isGoogleDevice=false).code */
      val P963F93 = "spec:width=480,height=1014,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P963F94, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F94, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P963F94 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F94_A, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F94_A, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P963F94_A = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F95, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F95, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P963F95 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963F95_A, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963F95_A, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val P963F95_A = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=P963T01C, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963T01C, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val P963T01C = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=P963T02C, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=P963T02C, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P963T02C = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=peony, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=peony, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PEONY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=primrose, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=primrose, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val PRIMROSE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=proline, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=proline, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PROLINE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=red, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=red, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RED = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=sapphire, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=sapphire, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val SAPPHIRE = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=sapphire4g, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=sapphire4g, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val SAPPHIRE4G = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=sdm660_64, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=sdm660_64, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SDM660_64 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=sheen, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=sheen, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SHEEN = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=sif, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=sif, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SIF = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=stark, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=stark, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val STARK = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=stollen, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=stollen, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val STOLLEN = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=sweet, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=sweet, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val SWEET = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=T86, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=T86, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val T86 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=tulip, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=tulip, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TULIP = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=TURKCELL-T40, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=TURKCELL-T40, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val TURKCELL_T40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=urd, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=urd, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val URD = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=verdandi, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=verdandi, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val VERDANDI = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=VFD511, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=VFD511, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val VFD511 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=V_P635T36, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=V_P635T36, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V_P635T36 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=V_P635T40, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=V_P635T40, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V_P635T40 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=V_P839T30, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=V_P839T30, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val V_P839T30 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=warp8, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=warp8, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val WARP8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=wellington, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=wellington, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val WELLINGTON = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=xuantan, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=xuantan, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val XUANTAN = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=YEV, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=YEV, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YEV = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=YMA, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=YMA, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val YMA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=YXE, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=YXE, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YXE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z3051T, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z3051T, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Z3051T = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=Z3052O, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z3052O, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Z3052O = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=Z3052T, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z3052T, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Z3052T = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=Z3101T, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z3101T, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Z3101T = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=Z3153, width=1080, height=2220, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z3153, width=1080,
      height=2220, dpi=440, isGoogleDevice=false).code */
      val Z3153 = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=ZTE, code=Z3351, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z3351, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Z3351 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=Z3352CA, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z3352CA, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Z3352CA = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=Z3353, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z3353, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Z3353 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=Z3511O, width=576, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z3511O, width=576,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val Z3511O = "spec:width=576,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=Z5031O, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z5031O, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Z5031O = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=Z5151, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z5151, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z5151 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z5155T, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z5155T, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z5155T = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z5156, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z5156, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z5156 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z5156U, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z5156U, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z5156U = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z5157, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z5157, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z5157 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z5158, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z5158, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z5158 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z5201T, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z5201T, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z5201T = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z5351T, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z5351T, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z5351T = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z5501S, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z5501S, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val Z5501S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z557, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z557, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Z557 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=Z559DL, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z559DL, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Z559DL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=Z6100T, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6100T, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val Z6100T = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z6201, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6201, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val Z6201 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z6202S, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6202S, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val Z6202S = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z6250, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6250, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val Z6250 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z6251, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6251, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z6251 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z6252, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6252, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z6252 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z6350T, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6350T, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val Z6350T = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z6351O, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6351O, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val Z6351O = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z6355O, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6355O, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z6355O = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z6356O, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6356O, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z6356O = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z6356T, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6356T, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z6356T = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z6400, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6400, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val Z6400 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=Z6410, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6410, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val Z6410 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=Z6530, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6530, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val Z6530 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=Z6556O, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6556O, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z6556O = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z6561S, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6561S, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val Z6561S = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=Z6571S, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6571S, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val Z6571S = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=Z6575S, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6575S, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val Z6575S = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=Z6576S, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6576S, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val Z6576S = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=Z6621O, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6621O, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val Z6621O = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z6650S, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6650S, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val Z6650S = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=Z6750, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6750, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val Z6750 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=Z6750K, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z6750K, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val Z6750K = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=Z7540, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z7540, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z7540 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=Z7750R, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z7750R, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val Z7750R = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=Z8850K, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z8850K, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val Z8850K = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=Z8888S, width=1188, height=2790, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z8888S, width=1188,
      height=2790, dpi=520, isGoogleDevice=false).code */
      val Z8888S = "spec:width=1188,height=2790,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_A110, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_A110,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val ZTE_BLADE_A110 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_A210, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_A210,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ZTE_BLADE_A210 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_A315, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_A315,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ZTE_BLADE_A315 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_A465, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_A465,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ZTE_BLADE_A465 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_A475, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_A475,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ZTE_BLADE_A475 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_A476, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_A476,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ZTE_BLADE_A476 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_A511, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_A511,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ZTE_BLADE_A511 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_A601, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_A601,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ZTE_BLADE_A601 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_A610, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_A610,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ZTE_BLADE_A610 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_C370, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_C370,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ZTE_BLADE_C370 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_L110, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_L110,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val ZTE_BLADE_L110 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_L2_PLUS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_L2_PLUS,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val ZTE_BLADE_L2_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_V0710, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_V0710,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ZTE_BLADE_V0710 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_V0720, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_V0720,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ZTE_BLADE_V0720 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_V0730, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_V0730,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ZTE_BLADE_V0730 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_V0800, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_V0800,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ZTE_BLADE_V0800 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_V0820, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_V0820,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ZTE_BLADE_V0820 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_V0850, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_BLADE_V0850,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ZTE_BLADE_V0850 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_V580, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_Blade_V580,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ZTE_BLADE_V580 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE-G720C, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE-G720C, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ZTE_G720C = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_T617, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_T617, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ZTE_T617 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_T620, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_T620, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ZTE_T620 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_T920, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_T920, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ZTE_T920 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_V971LM, width=600, height=1024, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_V971LM, width=600,
      height=1024, dpi=240, isGoogleDevice=false).code */
      val ZTE_V971LM = "spec:width=600,height=1024,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ZTE, code=ZTE_V97L, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=ZTE_V97L, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val ZTE_V97L = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZTE, code=zx55q05_64, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=zx55q05_64, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ZX55Q05_64 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=ZTE, code=Z-01K, width=1920, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZTE, code=Z-01K, width=1920,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val Z_01K = "spec:width=1920,height=2160,unit=px,dpi=480"

  }
