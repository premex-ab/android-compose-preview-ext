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
      /** LAVA A3_mini */
      val A3_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LAVA AF9020 */
      val AF9020 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** LAVA iris42 */
      val IRIS42 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LAVA iris50c */
      val IRIS50C = "spec:width=480,height=854,unit=px,dpi=240"

      /** LAVA iris51 */
      val IRIS51 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LAVA iris53 */
      val IRIS53 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LAVA iris60 */
      val IRIS60 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LAVA iris60c */
      val IRIS60C = "spec:width=480,height=854,unit=px,dpi=240"

      /** LAVA iris65 */
      val IRIS65 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LAVA iris80 */
      val IRIS80 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LAVA iris88 */
      val IRIS88 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LAVA iris880 */
      val IRIS880 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LAVA iris88s */
      val IRIS88S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LAVA iris88_go */
      val IRIS88_GO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LAVA iris88_lite */
      val IRIS88_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LAVA iris90 */
      val IRIS90 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LAVA LA82 */
      val LA82 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LAVA LAVAA1 */
      val LAVAA1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LAVA LAVA_A44 */
      val LAVA_A44 = "spec:width=480,height=800,unit=px,dpi=240"

      /** LAVA LE9810 */
      val LE9810 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** LAVA LE9820 */
      val LE9820 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** LAVA LE9910 */
      val LE9910 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** LAVA LE9920 */
      val LE9920 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** LAVA LE9920_P */
      val LE9920_P = "spec:width=600,height=1280,unit=px,dpi=280"

      /** LAVA LE9930 */
      val LE9930 = "spec:width=600,height=1280,unit=px,dpi=280"

      /** LAVA LE9940_W */
      val LE9940_W = "spec:width=600,height=1280,unit=px,dpi=300"

      /** LAVA LEX402 */
      val LEX402 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** LAVA LF9810_2GB */
      val LF9810_2GB = "spec:width=480,height=960,unit=px,dpi=240"

      /** LAVA LH9810 */
      val LH9810 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LAVA LH9910 */
      val LH9910 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LAVA LH9930 */
      val LH9930 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LAVA LH9931 */
      val LH9931 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LAVA LH9950 */
      val LH9950 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LAVA LN9810 */
      val LN9810 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LAVA LN9820 */
      val LN9820 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LAVA LN9910 */
      val LN9910 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LAVA LTN10RT */
      val LTN10RT = "spec:width=800,height=1280,unit=px,dpi=213"

      /** LAVA LTN8RT */
      val LTN8RT = "spec:width=800,height=1280,unit=px,dpi=240"

      /** LAVA LXX501 */
      val LXX501 = "spec:width=1080,height=2160,unit=px,dpi=403"

      /** LAVA LXX503 */
      val LXX503 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** LAVA LXX504 */
      val LXX504 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA LXX505 */
      val LXX505 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** LAVA LXX506 */
      val LXX506 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** LAVA LXX507 */
      val LXX507 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** LAVA LXX508 */
      val LXX508 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** LAVA LXX510 */
      val LXX510 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** LAVA LXX511 */
      val LXX511 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** LAVA LXX513 */
      val LXX513 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** LAVA LXX514 */
      val LXX514 = "spec:width=720,height=1604,unit=px,dpi=280"

      /** LAVA LXX515 */
      val LXX515 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** LAVA LXX516 */
      val LXX516 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA LXX517 */
      val LXX517 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA LXX518 */
      val LXX518 = "spec:width=1200,height=2652,unit=px,dpi=520"

      /** LAVA LXX522 */
      val LXX522 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA LZG402_1 */
      val LZG402_1 = "spec:width=480,height=854,unit=px,dpi=200"

      /** LAVA LZG402_OM */
      val LZG402_OM = "spec:width=480,height=854,unit=px,dpi=200"

      /** LAVA LZG403 */
      val LZG403 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA LZG403_225 */
      val LZG403_225 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA LZG403_25 */
      val LZG403_25 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA LZG409 */
      val LZG409 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA LZG410 */
      val LZG410 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA LZX403 */
      val LZX403 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA LZX406 */
      val LZX406 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** LAVA LZX408 */
      val LZX408 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA LZX414 */
      val LZX414 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** LAVA LZX415 */
      val LZX415 = "spec:width=720,height=1612,unit=px,dpi=480"

      /** LAVA LZX417 */
      val LZX417 = "spec:width=720,height=1612,unit=px,dpi=480"

      /** LAVA LZX419 */
      val LZX419 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA Magnum_Pro */
      val MAGNUM_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LAVA R1_Lite */
      val R1_LITE = "spec:width=480,height=854,unit=px,dpi=240"

      /** LAVA R3 */
      val R3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LAVA T101 */
      val T101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LAVA T101N */
      val T101N = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LAVA T71N */
      val T71N = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LAVA T71N_M */
      val T71N_M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** LAVA T71_w */
      val T71_W = "spec:width=600,height=1024,unit=px,dpi=160"

      /** LAVA T81 */
      val T81 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** LAVA T81N */
      val T81N = "spec:width=800,height=1280,unit=px,dpi=240"

      /** LAVA T81_PB */
      val T81_PB = "spec:width=800,height=1280,unit=px,dpi=240"

      /** LAVA Z1 */
      val Z1 = "spec:width=480,height=854,unit=px,dpi=180"

      /** LAVA Z35 */
      val Z35 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA Z3_UP */
      val Z3_UP = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA Z3_UP_2 */
      val Z3_UP_2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** LAVA Z50 */
      val Z50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LAVA Z50_Pro */
      val Z50_PRO = "spec:width=480,height=854,unit=px,dpi=240"

      /** LAVA Z51 */
      val Z51 = "spec:width=480,height=960,unit=px,dpi=240"

      /** LAVA Z60 */
      val Z60 = "spec:width=480,height=854,unit=px,dpi=240"

      /** LAVA Z60s */
      val Z60S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LAVA Z61 */
      val Z61 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LAVA Z61_2GB */
      val Z61_2GB = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LAVA Z80 */
      val Z80 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LAVA Z81 */
      val Z81 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LAVA Z90 */
      val Z90 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** LAVA Z91 */
      val Z91 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** LAVA Z92 */
      val Z92 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** LAVA ZX */
      val ZX = "spec:width=720,height=1520,unit=px,dpi=320"

  }
