package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VIPER device specifications for Android Compose previews.
 *
 * This extension provides VIPER device specifications that can be used with @Preview annotations
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
      /** VIPER VIPER-Z08MK */
      val VIPER_Z08MK = "spec:width=800,height=1280,unit=px,dpi=213"

  }
