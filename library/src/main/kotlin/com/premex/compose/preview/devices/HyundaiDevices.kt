package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hyundai device specifications for Android Compose previews.
 *
 * This extension provides Hyundai device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hyundai.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hyundai: Any
  get() = object {
      /** Hyundai bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hyundai e501 */
      val E501 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hyundai guandu */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hyundai H25568K */
      val H25568K = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Hyundai HT0703K */
      val HT0703K = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Hyundai HT0704K08 */
      val HT0704K08 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Hyundai HT0705W08 */
      val HT0705W08 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Hyundai HT0802W16 */
      val HT0802W16 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hyundai HT1003X16 */
      val HT1003X16 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hyundai HT1004L16 */
      val HT1004L16 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Hyundai HT1004X16 */
      val HT1004X16 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Hyundai HT10LA2MSGNA01 */
      val HT10LA2MSGNA01 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Hyundai HT10LB2MBKLTM */
      val HT10LB2MBKLTM = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Hyundai HT10LB3MBKLTM */
      val HT10LB3MBKLTM = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hyundai HT10LB3MBKWW */
      val HT10LB3MBKWW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hyundai HT10LC1MBKLTM */
      val HT10LC1MBKLTM = "spec:width=800,height=1280,unit=px,dpi=200"

      /** Hyundai HT10LC1MBKLTM01 */
      val HT10LC1MBKLTM01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hyundai HT1G50K */
      val HT1G50K = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hyundai HT2G50KBK */
      val HT2G50KBK = "spec:width=480,height=854,unit=px,dpi=240"

      /** Hyundai HT2G57K */
      val HT2G57K = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Hyundai HT2G57L */
      val HT2G57L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Hyundai HT3G60L */
      val HT3G60L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Hyundai HT7WB1RBK */
      val HT7WB1RBK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Hyundai HT7WC1PBK */
      val HT7WC1PBK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Hyundai HT8LA1RBKNA01 */
      val HT8LA1RBKNA01 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Hyundai HT8LAB1PBKLTM */
      val HT8LAB1PBKLTM = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Hyundai HT8LB1PBK01 */
      val HT8LB1PBK01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hyundai HT8WB1RBK02 */
      val HT8WB1RBK02 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hyundai HT8WB1RBK02A */
      val HT8WB1RBK02A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hyundai HT8WB1RBK03 */
      val HT8WB1RBK03 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hyundai HY65PA1401NA */
      val HY65PA1401NA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hyundai HY65PA1402NA */
      val HY65PA1402NA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Hyundai HY65PB1401NA */
      val HY65PB1401NA = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Hyundai HyTab_Plus_10LC2 */
      val HYTAB_PLUS_10LC2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hyundai ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Hyundai komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Hyundai Koral_10WB1 */
      val KORAL_10WB1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hyundai Koral_10X3 */
      val KORAL_10X3 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hyundai Koral_10XL */
      val KORAL_10XL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Hyundai Koral_7W4X */
      val KORAL_7W4X = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Hyundai Koral_7WB1 */
      val KORAL_7WB1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Hyundai Koral_7WC1 */
      val KORAL_7WC1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Hyundai Koral_7WD1 */
      val KORAL_7WD1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Hyundai Koral_8WC1 */
      val KORAL_8WC1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hyundai longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hyundai martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Hyundai redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Hyundai samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hyundai shinjuku */
      val SHINJUKU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Hyundai sindorim */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Hyundai 10LA2 */
      val _10LA2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Hyundai 10LB1 */
      val _10LB1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Hyundai 10LC1 */
      val _10LC1 = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** Hyundai 7LB1 */
      val _7LB1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Hyundai 8LAB1 */
      val _8LAB1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
