package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LUCOMS device specifications for Android Compose previews.
 *
 * This extension provides LUCOMS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LUCOMS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LUCOMS: Any
  get() = object {
      /** LUCOMS hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** LUCOMS mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** LUCOMS R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** LUCOMS R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** LUCOMS sindorim */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** LUCOMS stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** LUCOMS zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
