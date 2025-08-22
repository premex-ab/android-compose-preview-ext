package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NOMI device specifications for Android Compose previews.
 *
 * This extension provides NOMI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nomi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nomi: Any
  get() = object {
      /** NOMI Nomi_i5532 */
      val NOMI_I5532 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
