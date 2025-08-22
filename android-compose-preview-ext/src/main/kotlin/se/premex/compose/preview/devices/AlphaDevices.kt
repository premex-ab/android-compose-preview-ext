package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Alpha device specifications for Android Compose previews.
 *
 * This extension provides Alpha device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alpha.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alpha: Any
  get() = object {
      /** Alpha ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Alpha samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
