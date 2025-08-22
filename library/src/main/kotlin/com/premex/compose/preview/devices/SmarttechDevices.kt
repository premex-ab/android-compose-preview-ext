package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Smarttech device specifications for Android Compose previews.
 *
 * This extension provides Smarttech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smarttech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smarttech: Any
  get() = object {
      /** Smarttech cottongreen */
      val COTTONGREEN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Smarttech guandu */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Smarttech marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Smarttech martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Smarttech tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Smarttech yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
