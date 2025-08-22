package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sky device specifications for Android Compose previews.
 *
 * This extension provides Sky device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sky.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sky: Any
  get() = object {
      /** Sky B866VH */
      val B866VH = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** Sky DV6067Y_SKY */
      val DV6067Y_SKY = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Sky Elite_L55 */
      val ELITE_L55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Sky Elite_N55 */
      val ELITE_N55 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Sky Elite_OctaPlus */
      val ELITE_OCTAPLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Sky Elite_OctaPlusa2 */
      val ELITE_OCTAPLUSA2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Sky ELITE_T8 */
      val ELITE_T8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Sky Elite_T8Plus */
      val ELITE_T8PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Sky Elite_T8PUB */
      val ELITE_T8PUB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Sky Elite_T8PUSA */
      val ELITE_T8PUSA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Sky ELITE_US_T8 */
      val ELITE_US_T8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Sky KSTB3226 */
      val KSTB3226 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Sky Platinum_A7 */
      val PLATINUM_A7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Sky PLATINUM_VIEW2 */
      val PLATINUM_VIEW2 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** Sky PLATINUM_VIEW2_PLUS */
      val PLATINUM_VIEW2_PLUS = "spec:width=600,height=1024,unit=px,dpi=213"

      /** Sky Platinum_View2_V2 */
      val PLATINUM_VIEW2_V2 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** Sky Premier5_US */
      val PREMIER5_US = "spec:width=480,height=960,unit=px,dpi=240"

      /** Sky SEI800SKM */
      val SEI800SKM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
