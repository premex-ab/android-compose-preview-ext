package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Viper device specifications for Android Compose previews.
 *
 * This extension provides Viper device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Viper.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Viper: Any
  get() = object {
      /** Viper SZ11MK1 */
      val SZ11MK1 = "spec:width=800,height=1280,unit=px,dpi=200"

      /** Viper Z11MK */
      val Z11MK = "spec:width=1200,height=1920,unit=px,dpi=248"

  }
