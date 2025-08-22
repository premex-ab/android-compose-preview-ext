package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TUTU device specifications for Android Compose previews.
 *
 * This extension provides TUTU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tutu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tutu: Any
  get() = object {
      /** TUTU lakeside */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** TUTU nagai */
      val NAGAI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
