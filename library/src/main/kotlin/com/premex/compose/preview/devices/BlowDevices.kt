package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLOW device specifications for Android Compose previews.
 *
 * This extension provides BLOW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blow.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blow: Any
  get() = object {
      /** BLOW BlackTAB7 */
      val BLACKTAB7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BLOW BlackTab7_3G_V2 */
      val BLACKTAB7_3G_V2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BLOW BlackTAB8_4G */
      val BLACKTAB8_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BLOW GPSTAB7_4G */
      val GPSTAB7_4G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BLOW KidsTAB10_4G_EEA */
      val KIDSTAB10_4G_EEA = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** BLOW KidsTAB7_EEA */
      val KIDSTAB7_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** BLOW LaserTAB10 */
      val LASERTAB10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BLOW PlatinumTAB10 */
      val PLATINUMTAB10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** BLOW PlatinumTAB10V11 */
      val PLATINUMTAB10V11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BLOW PlatinumTAB10V22 */
      val PLATINUMTAB10V22 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** BLOW PlatinumTAB10_4G_V1 */
      val PLATINUMTAB10_4G_V1 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** BLOW PlatinumTAB10_4G_V2 */
      val PLATINUMTAB10_4G_V2 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** BLOW PlatinumTAB10_4G_V3 */
      val PLATINUMTAB10_4G_V3 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** BLOW PlatinumTAB11_4G */
      val PLATINUMTAB11_4G = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** BLOW PlatinumTAB8_4G */
      val PLATINUMTAB8_4G = "spec:width=800,height=1280,unit=px,dpi=213"

  }
