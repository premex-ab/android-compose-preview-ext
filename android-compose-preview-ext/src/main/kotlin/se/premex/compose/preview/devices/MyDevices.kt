package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * My device specifications for Android Compose previews.
 *
 * This extension provides My device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.My.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.My: Any
  get() = object {
      /** My tokyo */
      val TOKYO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** My yeoksam */
      val YEOKSAM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
