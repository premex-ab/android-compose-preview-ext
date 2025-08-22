package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ALBADEEL device specifications for Android Compose previews.
 *
 * This extension provides ALBADEEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Albadeel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Albadeel: Any
  get() = object {
      /** ALBADEEL ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ALBADEEL samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
