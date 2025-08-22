package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SCVInfinity device specifications for Android Compose previews.
 *
 * This extension provides SCVInfinity device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Scvinfinity.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Scvinfinity: Any
  get() = object {
      /** SCVInfinity SEI630SCV */
      val SEI630SCV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
