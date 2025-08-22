package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SUPERSONIC device specifications for Android Compose previews.
 *
 * This extension provides SUPERSONIC device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Supersonic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Supersonic: Any
  get() = object {
      /** SUPERSONIC kanda */
      val KANDA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SUPERSONIC SC_2110A */
      val SC_2110A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** SUPERSONIC SC_4317 */
      val SC_4317 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
