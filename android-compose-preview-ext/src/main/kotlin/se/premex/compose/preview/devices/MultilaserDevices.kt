package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MULTILASER device specifications for Android Compose previews.
 *
 * This extension provides MULTILASER device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Multilaser.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Multilaser: Any
  get() = object {
      /** MULTILASER martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MULTILASER zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
