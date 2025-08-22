package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAXSONIC-ELITE device specifications for Android Compose previews.
 *
 * This extension provides MAXSONIC-ELITE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MaxsonicElite.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MaxsonicElite: Any
  get() = object {
      /** MAXSONIC-ELITE stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MAXSONIC-ELITE zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
