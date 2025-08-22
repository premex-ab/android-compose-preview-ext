package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NOS device specifications for Android Compose previews.
 *
 * This extension provides NOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nos: Any
  get() = object {
      /** NOS DV9161-KPN */
      val DV9161_KPN = "spec:width=720,height=1280,unit=px,dpi=320"

  }
