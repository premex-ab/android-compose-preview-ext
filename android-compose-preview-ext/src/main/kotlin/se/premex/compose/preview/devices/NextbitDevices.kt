package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Nextbit device specifications for Android Compose previews.
 *
 * This extension provides Nextbit device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nextbit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nextbit: Any
  get() = object {
      /** Nextbit ether */
      val ETHER = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
