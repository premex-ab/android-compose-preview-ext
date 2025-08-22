package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Euskaltel device specifications for Android Compose previews.
 *
 * This extension provides Euskaltel device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Euskaltel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Euskaltel: Any
  get() = object {
      /** Euskaltel dciw384eus */
      val DCIW384EUS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Euskaltel m392 */
      val M392 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Euskaltel m393gena_esk */
      val M393GENA_ESK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Euskaltel uze4052ekt */
      val UZE4052EKT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
