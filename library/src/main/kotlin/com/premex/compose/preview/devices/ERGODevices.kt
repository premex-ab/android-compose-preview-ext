package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ERGO device specifications for Android Compose previews.
 *
 * This extension provides ERGO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ERGO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ERGO: Any
  get() = object {
      /** ERGO B502_Basic */
      val B502_BASIC = "spec:width=480,height=854,unit=px,dpi=240"

      /** ERGO byculla */
      val BYCULLA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ERGO longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ERGO redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ERGO SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ERGO V540_Level */
      val V540_LEVEL = "spec:width=480,height=960,unit=px,dpi=240"

      /** ERGO V550_Vision */
      val V550_VISION = "spec:width=640,height=1280,unit=px,dpi=320"

      /** ERGO V551_Aura */
      val V551_AURA = "spec:width=480,height=960,unit=px,dpi=240"

  }
