package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TOSHIBA device specifications for Android Compose previews.
 *
 * This extension provides TOSHIBA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TOSHIBA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TOSHIBA: Any
  get() = object {
      /** TOSHIBA hamamatsucho */
      val HAMAMATSUCHO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TOSHIBA hayward */
      val HAYWARD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TOSHIBA hirano */
      val HIRANO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** TOSHIBA l9450 */
      val L9450 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TOSHIBA tos13t7gt */
      val TOS13T7GT = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TOSHIBA tos14ast10 */
      val TOS14AST10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** TOSHIBA tos15ast20 */
      val TOS15AST20 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** TOSHIBA tost7t */
      val TOST7T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TOSHIBA tostab11BA */
      val TOSTAB11BA = "spec:width=752,height=1280,unit=px,dpi=160"

      /** TOSHIBA tostab11BS */
      val TOSTAB11BS = "spec:width=736,height=1280,unit=px,dpi=213"

      /** TOSHIBA tostab12AL */
      val TOSTAB12AL = "spec:width=752,height=1280,unit=px,dpi=160"

      /** TOSHIBA tostab12BA */
      val TOSTAB12BA = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** TOSHIBA tostab12BL */
      val TOSTAB12BL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TOSHIBA tostv14rtk1 */
      val TOSTV14RTK1 = "spec:width=768,height=1366,unit=px,dpi=213"

      /** TOSHIBA tostv14rtk2 */
      val TOSTV14RTK2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TOSHIBA tostv15rtk2 */
      val TOSTV15RTK2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
