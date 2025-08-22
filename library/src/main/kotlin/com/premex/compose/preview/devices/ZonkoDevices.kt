package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZONKO device specifications for Android Compose previews.
 *
 * This extension provides ZONKO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zonko.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zonko: Any
  get() = object {
      /** ZONKO D105 */
      val D105 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ZONKO D106 */
      val D106 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** ZONKO D110 */
      val D110 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** ZONKO D115 */
      val D115 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** ZONKO D118 */
      val D118 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** ZONKO K101 */
      val K101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZONKO K101_EEA */
      val K101_EEA = "spec:width=1200,height=1920,unit=px,dpi=160"

      /** ZONKO K105 */
      val K105 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZONKO K105_EEA */
      val K105_EEA = "spec:width=1440,height=2960,unit=px,dpi=560"

      /** ZONKO K106 */
      val K106 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** ZONKO K110 */
      val K110 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZONKO K113 */
      val K113 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZONKO K116_M */
      val K116_M = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ZONKO K118 */
      val K118 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ZONKO K150 */
      val K150 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** ZONKO K710 */
      val K710 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ZONKO K711 */
      val K711 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
