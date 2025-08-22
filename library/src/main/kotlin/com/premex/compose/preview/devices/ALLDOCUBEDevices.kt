package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALLDOCUBE device specifications for Android Compose previews.
 *
 * This extension provides ALLDOCUBE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALLDOCUBE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALLDOCUBE: Any
  get() = object {
      /** ALLDOCUBE iPlay_70_mini_Ultra */
      val IPLAY_70_MINI_ULTRA = "spec:width=1600,height=2560,unit=px,dpi=340"

      /** ALLDOCUBE T1001 */
      val T1001 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** ALLDOCUBE T701 */
      val T701 = "spec:width=720,height=1280,unit=px,dpi=240"

      /** ALLDOCUBE T806 */
      val T806 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ALLDOCUBE T806ME */
      val T806ME = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ALLDOCUBE T806MH */
      val T806MH = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ALLDOCUBE U1005 */
      val U1005 = "spec:width=1600,height=2560,unit=px,dpi=240"

      /** ALLDOCUBE U1005E */
      val U1005E = "spec:width=1600,height=2560,unit=px,dpi=240"

      /** ALLDOCUBE U1006 */
      val U1006 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** ALLDOCUBE U1006E */
      val U1006E = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** ALLDOCUBE U1006H */
      val U1006H = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** ALLDOCUBE U63PLUS */
      val U63PLUS = "spec:width=800,height=1280,unit=px,dpi=240"

  }
