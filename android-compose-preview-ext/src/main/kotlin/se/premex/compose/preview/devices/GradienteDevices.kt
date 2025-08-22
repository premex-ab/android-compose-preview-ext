package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Gradiente device specifications for Android Compose previews.
 *
 * This extension provides Gradiente device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gradiente.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gradiente: Any
  get() = object {
      /** Gradiente GTB_106 */
      val GTB_106 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
