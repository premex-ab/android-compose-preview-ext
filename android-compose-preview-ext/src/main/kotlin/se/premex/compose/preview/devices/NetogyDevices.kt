package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NETOGY device specifications for Android Compose previews.
 *
 * This extension provides NETOGY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Netogy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Netogy: Any
  get() = object {
      /** NETOGY YXU */
      val YXU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
