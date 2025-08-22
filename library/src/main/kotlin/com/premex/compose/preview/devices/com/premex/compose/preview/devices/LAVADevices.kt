package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LAVA device specifications for Android Compose previews.
 *
 * This extension provides LAVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LAVA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LAVA: Any
  get() = object {
      /** DeviceSpec(manufacturer=LAVA, code=A3_mini, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=A3_mini, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val A3_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=AF9020, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=AF9020, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val AF9020 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=iris42, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=iris42, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val IRIS42 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=iris50c, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=iris50c, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val IRIS50C = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=iris51, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=iris51, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IRIS51 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=iris53, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=iris53, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val IRIS53 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=iris60, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=iris60, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val IRIS60 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=iris60c, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=iris60c, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val IRIS60C = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=iris65, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=iris65, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IRIS65 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=iris80, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=iris80, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IRIS80 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=iris88, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=iris88, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val IRIS88 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=iris880, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=iris880, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val IRIS880 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=iris88s, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=iris88s, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val IRIS88S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=iris88_go, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=iris88_go, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val IRIS88_GO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=iris88_lite, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=iris88_lite, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val IRIS88_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=iris90, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=iris90, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val IRIS90 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LA82, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LA82, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LA82 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=LAVAA1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LAVAA1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LAVAA1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LAVA_A44, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LAVA_A44, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val LAVA_A44 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=LE9810, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LE9810, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val LE9810 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LE9820, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LE9820, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val LE9820 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LE9910, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LE9910, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val LE9910 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LE9920, width=600, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LE9920, width=600,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val LE9920 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=LAVA, code=LE9920_P, width=600, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LE9920_P, width=600,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val LE9920_P = "spec:width=600,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=LAVA, code=LE9930, width=600, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LE9930, width=600,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val LE9930 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=LAVA, code=LE9940_W, width=600, height=1280, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LE9940_W, width=600,
      height=1280, dpi=300, isGoogleDevice=false).code */
      val LE9940_W = "spec:width=600,height=1280,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=LAVA, code=LEX402, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LEX402, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val LEX402 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=LAVA, code=LF9810_2GB, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LF9810_2GB, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LF9810_2GB = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=LH9810, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LH9810, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LH9810 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=LH9910, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LH9910, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LH9910 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=LH9930, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LH9930, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LH9930 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=LH9931, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LH9931, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LH9931 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=LH9950, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LH9950, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LH9950 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=LN9810, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LN9810, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LN9810 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=LN9820, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LN9820, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LN9820 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=LN9910, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LN9910, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LN9910 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=LTN10RT, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LTN10RT, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val LTN10RT = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LAVA, code=LTN8RT, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LTN8RT, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val LTN8RT = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=LXX501, width=1080, height=2160, dpi=403,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX501, width=1080,
      height=2160, dpi=403, isGoogleDevice=false).code */
      val LXX501 = "spec:width=1080,height=2160,unit=px,dpi=403"

      /** DeviceSpec(manufacturer=LAVA, code=LXX503, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX503, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val LXX503 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LAVA, code=LXX504, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX504, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LXX504 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LXX505, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX505, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val LXX505 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LAVA, code=LXX506, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX506, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val LXX506 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LAVA, code=LXX507, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX507, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val LXX507 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LXX508, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX508, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val LXX508 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LAVA, code=LXX510, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX510, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val LXX510 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=LAVA, code=LXX511, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX511, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val LXX511 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LXX513, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX513, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val LXX513 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LAVA, code=LXX514, width=720, height=1604, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX514, width=720,
      height=1604, dpi=280, isGoogleDevice=false).code */
      val LXX514 = "spec:width=720,height=1604,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=LAVA, code=LXX515, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX515, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val LXX515 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LAVA, code=LXX516, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX516, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LXX516 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LXX517, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX517, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LXX517 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LXX518, width=1200, height=2652, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX518, width=1200,
      height=2652, dpi=520, isGoogleDevice=false).code */
      val LXX518 = "spec:width=1200,height=2652,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=LAVA, code=LXX522, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LXX522, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LXX522 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LZG402_1, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LZG402_1, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val LZG402_1 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LAVA, code=LZG402_OM, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LZG402_OM, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val LZG402_OM = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LAVA, code=LZG403, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LZG403, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LZG403 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LZG403_225, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LZG403_225, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LZG403_225 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LZG403_25, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LZG403_25, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LZG403_25 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LZG409, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LZG409, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LZG409 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LZG410, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LZG410, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LZG410 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LZX403, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LZX403, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LZX403 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LZX406, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LZX406, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val LZX406 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=LAVA, code=LZX408, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LZX408, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LZX408 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=LZX414, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LZX414, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val LZX414 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=LAVA, code=LZX415, width=720, height=1612, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LZX415, width=720,
      height=1612, dpi=480, isGoogleDevice=false).code */
      val LZX415 = "spec:width=720,height=1612,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LAVA, code=LZX417, width=720, height=1612, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LZX417, width=720,
      height=1612, dpi=480, isGoogleDevice=false).code */
      val LZX417 = "spec:width=720,height=1612,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LAVA, code=LZX419, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=LZX419, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LZX419 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=Magnum_Pro, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Magnum_Pro, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MAGNUM_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LAVA, code=R1_Lite, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=R1_Lite, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val R1_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=R3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=R3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val R3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=T101, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=T101, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LAVA, code=T101N, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=T101N, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T101N = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LAVA, code=T71N, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=T71N, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T71N = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LAVA, code=T71N_M, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=T71N_M, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T71N_M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LAVA, code=T71_w, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=T71_w, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T71_W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LAVA, code=T81, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=T81, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val T81 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=T81N, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=T81N, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val T81N = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=T81_PB, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=T81_PB, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val T81_PB = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=Z1, width=480, height=854, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z1, width=480,
      height=854, dpi=180, isGoogleDevice=false).code */
      val Z1 = "spec:width=480,height=854,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=LAVA, code=Z35, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z35, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z35 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=Z3_UP, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z3_UP, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z3_UP = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=Z3_UP_2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z3_UP_2, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z3_UP_2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=Z50, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z50, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Z50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=Z50_Pro, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z50_Pro, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Z50_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=Z51, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z51, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Z51 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=Z60, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z60, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val Z60 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LAVA, code=Z60s, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z60s, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Z60S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=Z61, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z61, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z61 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=Z61_2GB, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z61_2GB, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z61_2GB = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=Z80, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z80, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Z80 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=Z81, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z81, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z81 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=Z90, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z90, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Z90 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=Z91, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z91, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z91 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=Z92, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=Z92, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val Z92 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAVA, code=ZX, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAVA, code=ZX, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val ZX = "spec:width=720,height=1520,unit=px,dpi=320"

  }
