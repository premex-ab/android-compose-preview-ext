package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Neoregent device specifications for Android Compose previews.
 *
 * This extension provides Neoregent device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Neoregent.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Neoregent: Any
  get() = object {
      /** Neoregent KT1007_EEA */
      val KT1007_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
