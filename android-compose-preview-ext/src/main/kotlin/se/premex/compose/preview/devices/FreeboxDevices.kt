package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Freebox device specifications for Android Compose previews.
 *
 * This extension provides Freebox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Freebox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Freebox: Any
  get() = object {
      /** Freebox fbx6lc */
      val FBX6LC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Freebox fbx6lcv2 */
      val FBX6LCV2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Freebox fbx8am */
      val FBX8AM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
