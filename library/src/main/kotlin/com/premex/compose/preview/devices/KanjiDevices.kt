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
 * @Preview(device = Devices.Kanji.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kanji: Any
  get() = object {
      /** KANJI KANJI-AC05 */
      val KANJI_AC05 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KANJI KJ-AC02 */
      val KJ_AC02 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** KANJI KJ_AC05 */
      val KJ_AC05 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** KANJI KJ_ALFARK */
      val KJ_ALFARK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KANJI KJ_ARIZONA */
      val KJ_ARIZONA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KANJI KJ_OB02 */
      val KJ_OB02 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KANJI KJ_YUBI */
      val KJ_YUBI = "spec:width=600,height=1024,unit=px,dpi=160"

      /** KANJI martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KANJI patrick */
      val PATRICK = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
