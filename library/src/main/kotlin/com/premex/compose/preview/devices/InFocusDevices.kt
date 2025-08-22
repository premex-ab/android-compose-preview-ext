package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * InFocus device specifications for Android Compose previews.
 *
 * This extension provides InFocus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.InFocus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.InFocus: Any
  get() = object {
      /** InFocus A02 */
      val A02 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** InFocus A08 */
      val A08 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** InFocus AA2 */
      val AA2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** InFocus AB2 */
      val AB2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** InFocus AB5 */
      val AB5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** InFocus AG2 */
      val AG2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** InFocus AG5 */
      val AG5 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** InFocus AH2 */
      val AH2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** InFocus AU8 */
      val AU8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** InFocus AY2 */
      val AY2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** InFocus D77 */
      val D77 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** InFocus FAT */
      val FAT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** InFocus FOT */
      val FOT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** InFocus G10 */
      val G10 = "spec:width=768,height=1280,unit=px,dpi=320"

      /** InFocus G40 */
      val G40 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** InFocus G42 */
      val G42 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** InFocus HGO */
      val HGO = "spec:width=480,height=854,unit=px,dpi=240"

      /** InFocus IF195a */
      val IF195A = "spec:width=900,height=1600,unit=px,dpi=160"

      /** InFocus IF236a */
      val IF236A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** InFocus VN2 */
      val VN2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** InFocus VNA */
      val VNA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** InFocus VZH */
      val VZH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** InFocus ZD1 */
      val ZD1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** InFocus ZM1 */
      val ZM1 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
