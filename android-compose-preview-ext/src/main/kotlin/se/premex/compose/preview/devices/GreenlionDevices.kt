package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GREENLION device specifications for Android Compose previews.
 *
 * This extension provides GREENLION device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Greenlion.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Greenlion: Any
  get() = object {
      /** GREENLION G-20ULTRA */
      val G_20ULTRA = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
