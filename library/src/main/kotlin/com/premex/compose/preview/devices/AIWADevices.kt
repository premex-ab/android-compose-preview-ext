package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AIWA device specifications for Android Compose previews.
 *
 * This extension provides AIWA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AIWA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AIWA: Any
  get() = object {
      /** AIWA AIWA_A81 */
      val AIWA_A81 = "spec:width=800,height=1280,unit=px,dpi=300"

      /** AIWA AW790 */
      val AW790 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** AIWA AWM501 */
      val AWM501 = "spec:width=480,height=960,unit=px,dpi=240"

      /** AIWA AWM539 */
      val AWM539 = "spec:width=480,height=960,unit=px,dpi=240"

      /** AIWA AWPP101AW */
      val AWPP101AW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AIWA AWT10H */
      val AWT10H = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AIWA AW-P */
      val AW_P = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AIWA AW_TAB10_14 */
      val AW_TAB10_14 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AIWA hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AIWA ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AIWA lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AIWA longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AIWA mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AIWA R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AIWA R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AIWA redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AIWA samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AIWA shinagawa */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AIWA sindorim */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AIWA stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AIWA SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** AIWA TA07-2GB */
      val TA07_2GB = "spec:width=600,height=1024,unit=px,dpi=160"

      /** AIWA TA10-SO10 */
      val TA10_SO10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AIWA TABLETAWTH801 */
      val TABLETAWTH801 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AIWA TAB_1003G */
      val TAB_1003G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AIWA TAB-1100 */
      val TAB_1100 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** AIWA TAB-1102 */
      val TAB_1102 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** AIWA TAB-1103 */
      val TAB_1103 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** AIWA TA-07-232 */
      val TA_07_232 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** AIWA TA-10-232 */
      val TA_10_232 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** AIWA zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
