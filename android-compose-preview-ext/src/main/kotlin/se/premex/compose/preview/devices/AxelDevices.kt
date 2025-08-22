package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AXEL device specifications for Android Compose previews.
 *
 * This extension provides AXEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Axel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Axel: Any
  get() = object {
      /** AXEL AX_PRO */
      val AX_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

  }
