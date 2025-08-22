package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NIO device specifications for Android Compose previews.
 *
 * This extension provides NIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nio: Any
  get() = object {
      /** NIO davinci */
      val DAVINCI = "spec:width=1440,height=3200,unit=px,dpi=600"

      /** NIO picasso */
      val PICASSO = "spec:width=1440,height=3168,unit=px,dpi=600"

  }
