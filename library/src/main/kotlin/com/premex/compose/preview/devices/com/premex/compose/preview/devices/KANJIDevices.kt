package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KANJI device specifications for Android Compose previews.
 *
 * This extension provides KANJI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KANJI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KANJI: Any
  get() = object {
      /** DeviceSpec(manufacturer=KANJI, code=KANJI-AC05, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KANJI, code=KANJI-AC05, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KANJI_AC05 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KANJI, code=KJ-AC02, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KANJI, code=KJ-AC02, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KJ_AC02 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KANJI, code=KJ_AC05, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KANJI, code=KJ_AC05, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KJ_AC05 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KANJI, code=KJ_ALFARK, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KANJI, code=KJ_ALFARK, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KJ_ALFARK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KANJI, code=KJ_ARIZONA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KANJI, code=KJ_ARIZONA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KJ_ARIZONA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KANJI, code=KJ_OB02, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KANJI, code=KJ_OB02, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KJ_OB02 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KANJI, code=KJ-OB02, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KANJI, code=KJ-OB02, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KJ_OB02 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KANJI, code=KJ_YUBI, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KANJI, code=KJ_YUBI, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KJ_YUBI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KANJI, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KANJI, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KANJI, code=patrick, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KANJI, code=patrick, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PATRICK = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
