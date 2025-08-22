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
      /** DeviceSpec(manufacturer=Euskaltel, code=dciw384eus, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Euskaltel, code=dciw384eus,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DCIW384EUS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Euskaltel, code=m392, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Euskaltel, code=m392, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val M392 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Euskaltel, code=m393gena_esk, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Euskaltel, code=m393gena_esk,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val M393GENA_ESK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Euskaltel, code=uze4052ekt, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Euskaltel, code=uze4052ekt,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UZE4052EKT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
