package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Maxwest device specifications for Android Compose previews.
 *
 * This extension provides Maxwest device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maxwest.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maxwest: Any
  get() = object {
      /** Maxwest Astro_55R */
      val ASTRO_55R = "spec:width=480,height=960,unit=px,dpi=240"

      /** Maxwest Astro_55T */
      val ASTRO_55T = "spec:width=480,height=960,unit=px,dpi=240"

      /** Maxwest Astro_5T */
      val ASTRO_5T = "spec:width=480,height=854,unit=px,dpi=213"

      /** Maxwest Astro_5X */
      val ASTRO_5X = "spec:width=480,height=854,unit=px,dpi=213"

      /** Maxwest Astro_63R */
      val ASTRO_63R = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Maxwest Astro_8Q */
      val ASTRO_8Q = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Maxwest Astro_8R */
      val ASTRO_8R = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Maxwest Gravity_5_GO */
      val GRAVITY_5_GO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Maxwest Gravity_6P */
      val GRAVITY_6P = "spec:width=720,height=1560,unit=px,dpi=240"

      /** Maxwest GRAVITY_G6 */
      val GRAVITY_G6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Maxwest MX-A100RWW */
      val MX_A100RWW = "spec:width=800,height=1280,unit=px,dpi=200"

      /** Maxwest MX-A10R1WW */
      val MX_A10R1WW = "spec:width=800,height=1280,unit=px,dpi=200"

      /** Maxwest MX-A10RWW */
      val MX_A10RWW = "spec:width=800,height=1280,unit=px,dpi=200"

      /** Maxwest MX-A10WW */
      val MX_A10WW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Maxwest MX-A4R */
      val MX_A4R = "spec:width=480,height=800,unit=px,dpi=220"

      /** Maxwest MX-A63 */
      val MX_A63 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** Maxwest MX-A64 */
      val MX_A64 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** Maxwest MX-A65 */
      val MX_A65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Maxwest MX-A66WW */
      val MX_A66WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Maxwest MX-A6T */
      val MX_A6T = "spec:width=480,height=960,unit=px,dpi=213"

      /** Maxwest MX-G55 */
      val MX_G55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Maxwest MX-GG128WW */
      val MX_GG128WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Maxwest MX-GG64WW */
      val MX_GG64WW = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Maxwest MX-GG65 */
      val MX_GG65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Maxwest MX-NA65 */
      val MX_NA65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Maxwest MX-NG56 */
      val MX_NG56 = "spec:width=480,height=960,unit=px,dpi=200"

      /** Maxwest MX-NN62WW01 */
      val MX_NN62WW01 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** Maxwest Nitro_4X */
      val NITRO_4X = "spec:width=480,height=800,unit=px,dpi=240"

      /** Maxwest Nitro_55A */
      val NITRO_55A = "spec:width=480,height=960,unit=px,dpi=240"

      /** Maxwest Nitro_55C */
      val NITRO_55C = "spec:width=480,height=960,unit=px,dpi=240"

      /** Maxwest Nitro_55E */
      val NITRO_55E = "spec:width=480,height=960,unit=px,dpi=240"

      /** Maxwest Nitro_55Q */
      val NITRO_55Q = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Maxwest Nitro_55R */
      val NITRO_55R = "spec:width=480,height=960,unit=px,dpi=240"

      /** Maxwest Nitro_5C */
      val NITRO_5C = "spec:width=480,height=854,unit=px,dpi=213"

      /** Maxwest Nitro_5P */
      val NITRO_5P = "spec:width=480,height=854,unit=px,dpi=240"

      /** Maxwest Nitro_7Q */
      val NITRO_7Q = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Maxwest Nitro_8 */
      val NITRO_8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Maxwest PANDA_KIDS_7 */
      val PANDA_KIDS_7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Maxwest TAB-9G */
      val TAB_9G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Maxwest TAB_MAX_7 */
      val TAB_MAX_7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
