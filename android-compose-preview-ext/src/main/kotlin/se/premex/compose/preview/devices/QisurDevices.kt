package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Qisur device specifications for Android Compose previews.
 *
 * This extension provides Qisur device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qisur.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qisur: Any
  get() = object {
      /** Qisur R106 */
      val R106 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Qisur X72 */
      val X72 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
