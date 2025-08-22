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
      /** DeviceSpec(manufacturer=TOSHIBA, code=hamamatsucho, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=hamamatsucho,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val HAMAMATSUCHO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOSHIBA, code=hayward, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=hayward, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HAYWARD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOSHIBA, code=hirano, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=hirano, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HIRANO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOSHIBA, code=l9450, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=l9450, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val L9450 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TOSHIBA, code=tos13t7gt, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=tos13t7gt, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TOS13T7GT = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TOSHIBA, code=tos14ast10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=tos14ast10,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TOS14AST10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TOSHIBA, code=tos15ast20, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=tos15ast20,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TOS15AST20 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=TOSHIBA, code=tost7t, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=tost7t, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TOST7T = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TOSHIBA, code=tostab11BA, width=752, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=tostab11BA,
      width=752, height=1280, dpi=160, isGoogleDevice=false).code */
      val TOSTAB11BA = "spec:width=752,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TOSHIBA, code=tostab11BS, width=736, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=tostab11BS,
      width=736, height=1280, dpi=213, isGoogleDevice=false).code */
      val TOSTAB11BS = "spec:width=736,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOSHIBA, code=tostab12AL, width=752, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=tostab12AL,
      width=752, height=1280, dpi=160, isGoogleDevice=false).code */
      val TOSTAB12AL = "spec:width=752,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TOSHIBA, code=tostab12BA, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=tostab12BA,
      width=1600, height=2560, dpi=320, isGoogleDevice=false).code */
      val TOSTAB12BA = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TOSHIBA, code=tostab12BL, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=tostab12BL,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TOSTAB12BL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TOSHIBA, code=tostv14rtk1, width=768, height=1366, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=tostv14rtk1,
      width=768, height=1366, dpi=213, isGoogleDevice=false).code */
      val TOSTV14RTK1 = "spec:width=768,height=1366,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=TOSHIBA, code=tostv14rtk2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=tostv14rtk2,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val TOSTV14RTK2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TOSHIBA, code=tostv15rtk2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TOSHIBA, code=tostv15rtk2,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val TOSTV15RTK2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
