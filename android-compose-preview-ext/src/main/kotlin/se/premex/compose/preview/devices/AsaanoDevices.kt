package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ASAANO device specifications for Android Compose previews.
 *
 * This extension provides ASAANO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Asaano.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Asaano: Any
  get() = object {
      /** ASAANO hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
