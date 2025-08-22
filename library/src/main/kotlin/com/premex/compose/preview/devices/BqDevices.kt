package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * bq device specifications for Android Compose previews.
 *
 * This extension provides bq device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bq: Any
  get() = object {
      /** bq Aquaris_A45_sprout */
      val AQUARIS_A45_SPROUT = "spec:width=540,height=960,unit=px,dpi=240"

      /** bq Aquaris_E10 */
      val AQUARIS_E10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** bq Aquaris_E10_3G */
      val AQUARIS_E10_3G = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** bq Aquaris_E4 */
      val AQUARIS_E4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** bq Aquaris_E45 */
      val AQUARIS_E45 = "spec:width=540,height=960,unit=px,dpi=240"

      /** bq Aquaris_E5 */
      val AQUARIS_E5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** bq Aquaris_E5_HD */
      val AQUARIS_E5_HD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** bq Aquaris_M10 */
      val AQUARIS_M10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** bq Aquaris_M10_FHD */
      val AQUARIS_M10_FHD = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** bq Aquaris_M45 */
      val AQUARIS_M45 = "spec:width=540,height=960,unit=px,dpi=240"

      /** bq Aquaris_M5 */
      val AQUARIS_M5 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** bq Aquaris_M55 */
      val AQUARIS_M55 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** bq Aquaris_M8 */
      val AQUARIS_M8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** bq Aquaris_X5 */
      val AQUARIS_X5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** bq Aquaris_X5_Plus */
      val AQUARIS_X5_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** bq bardock */
      val BARDOCK = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** bq bardock-pro */
      val BARDOCK_PRO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** bq chaozu */
      val CHAOZU = "spec:width=720,height=1280,unit=px,dpi=320"

      /** bq chaozulite */
      val CHAOZULITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** bq Edison_3 */
      val EDISON_3 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** bq Edison_3_3G */
      val EDISON_3_3G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** bq Edison_3_mini */
      val EDISON_3_MINI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** bq FREEZERLTE */
      val FREEZERLTE = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** bq jeice */
      val JEICE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** bq nappa */
      val NAPPA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** bq nappa_s */
      val NAPPA_S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** bq raditz */
      val RADITZ = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** bq raditz_s */
      val RADITZ_S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** bq tenshi */
      val TENSHI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** bq yamcha */
      val YAMCHA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** bq yamchalite */
      val YAMCHALITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** bq zangyapro_sprout */
      val ZANGYAPRO_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** bq zangya_sprout */
      val ZANGYA_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=420"

  }
