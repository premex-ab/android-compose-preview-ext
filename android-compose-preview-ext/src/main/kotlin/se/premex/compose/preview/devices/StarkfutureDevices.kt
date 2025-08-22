package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * StarkFuture device specifications for Android Compose previews.
 *
 * This extension provides StarkFuture device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Starkfuture.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Starkfuture: Any
  get() = object {
      /** StarkFuture ARKENSTONE */
      val ARKENSTONE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** StarkFuture ARKENSTONE_US */
      val ARKENSTONE_US = "spec:width=720,height=1612,unit=px,dpi=320"

  }
